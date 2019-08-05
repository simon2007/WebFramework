package org.blue.webframework.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTUtils {
	// token 密钥
		private static String secret = "_secret_";
		private static String issuser="SERVICE";
		private static String subject="this is test token";

	

		/**
		 * @Title: createTokenWithClaim
		 * @Description: 带参数的token
		 * @param: data
		 * @return: String
		 * @throws
		 */
		public static String createTokenWithClaim(JSONObject data) {
			try {
				Algorithm algorithm = Algorithm.HMAC256(secret);
				Map<String, Object> map = new HashMap<String, Object>();
				Date nowDate = new Date();
				Date expireDate = getAfterDate(nowDate, Calendar.DATE, 2);// 2天
				map.put("alg", "HS256");
				map.put("typ", "JWT");
				String token = JWT.create()
						/* 设置头部信息 Header */
						.withHeader(map)
						/* 设置 载荷 Payload */
						.withClaim("data", data.toString())
						.withIssuer(issuser)
						.withSubject(subject)
						.withAudience("APP")
						.withIssuedAt(nowDate)
						.withExpiresAt(expireDate)
						/* 签名 Signature */
						.sign(algorithm);
				return token;
			} catch (JWTCreationException exception) {
				exception.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			return null;
		}

		/**
		 * 返回给定时间后的日
		 * 
		 * @param date
		 *            始计时的时间
		 * @param field
		 * the calendar field.
		 * @param amount 
		 *      the amount of date or time to be added to the field.
		 * @return
		 */
		private static Date getAfterDate(Date date, int filed,int time) {
			if (date == null) {
				date = new Date();
			}

			Calendar cal = new GregorianCalendar();

			cal.setTime(date);
			cal.add(filed, time);
			return cal.getTime();
		}

		/**
		 * @Title: verifyToken
		 * @Description: 验证token
		 * @param: @param token
		 * @return: void
		 * @throws
		 */
		private static DecodedJWT decodeToken(String token) {
			DecodedJWT jwt = null;
			try {
				Algorithm algorithm = Algorithm.HMAC256(secret);
				JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuser).build(); // Reusable
				jwt = verifier.verify(token);
			} catch (JWTVerificationException exception) {
				exception.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			return jwt;
		}


		/**
		 * @Title: getDataFromToken   
		 * @Description: 从token中获取参数data
		 * @param: @param token
		 * @param: @return
		 * @return: JSONObject      
		 * @throws
		 */
		public static JSONObject getDataFromToken(String token) {
			DecodedJWT djwt = decodeToken(token);
			JSONObject jd = new JSONObject();
			if (djwt != null) {
				if(!subject.equals(djwt.getSubject()))
						return jd;
				Claim claim = djwt.getClaim("data");
				String data = claim.asString();
				if (StringUtils.isNotBlank(data)) {
					jd = JSONObject.parseObject(data);
				}
			}
			return jd;
		}

}
