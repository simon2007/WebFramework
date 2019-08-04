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

		/**
		 * @Title: createToken
		 * @Description: 创建token
		 * @return: String
		 * @throws
		 */
		public static String createToken() {
			try {
				Algorithm algorithm = Algorithm.HMAC256(secret);
				// 头部信息
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("alg", "HS256");
				map.put("typ", "JWT");

				Date nowDate = new Date();
				Date expireDate = getAfterDate(nowDate, 1, 0, 0, 0, 0, 0);// �? �? �? �? �? �?

				String token = JWT.create()
						/* 设置头部信息 Header */
						.withHeader(map)
						/* 设置 载荷 Payload */
						.withIssuer("SERVICE")// 签名是有谁生�? 例如 服务�?
						.withSubject("this is test token")// 签名的主�?
						// .withNotBefore(new Date())//定义在什么时间之前，该jwt都是不可用的.
						.withAudience("APP")// 签名的观�? 也可以理解谁接受签名�?
						.withIssuedAt(nowDate) // 生成签名的时�?
						.withExpiresAt(expireDate)// 签名过期的时�?
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
		 * @Title: createTokenWithClaim
		 * @Description: 带参数的token
		 * @param: data
		 * @return: String
		 * @throws
		 */
		public static String createTokenWithClaim(JSONObject data) {
			try {
				Algorithm algorithm = Algorithm.HMAC256("secret");
				Map<String, Object> map = new HashMap<String, Object>();
				Date nowDate = new Date();
				Date expireDate = getAfterDate(nowDate, 0, 0, 0, 2, 0, 0);// 2小过�?
				map.put("alg", "HS256");
				map.put("typ", "JWT");
				String token = JWT.create()
						/* 设置头部信息 Header */
						.withHeader(map)
						/* 设置 载荷 Payload */
						.withClaim("data", data.toString())//token携带的参�?
						.withIssuer("SERVICE")// 签名是有谁生�?
						.withSubject("this is test token")// 签名的主�?
						// .withNotBefore(new Date())//定义在什么时间之前，该jwt都是不可用的.
						.withAudience("APP")// 签名的观�? 也可以理解谁接受签名�?
						.withIssuedAt(nowDate) // 生成签名的时�?
						.withExpiresAt(expireDate)// 签名过期的时�?
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
		 * @param year
		 *            增加的年
		 * @param month
		 *            增加的月
		 * @param day
		 *            增加的日
		 * @param hour
		 *            增加的小时
		 * @param minute
		 *            增加的分钟
		 * @param second
		 *            增加的秒
		 * @return
		 */
		private static Date getAfterDate(Date date, int year, int month, int day, int hour, int minute, int second) {
			if (date == null) {
				date = new Date();
			}

			Calendar cal = new GregorianCalendar();

			cal.setTime(date);
			if (year != 0) {
				cal.add(Calendar.YEAR, year);
			}
			if (month != 0) {
				cal.add(Calendar.MONTH, month);
			}
			if (day != 0) {
				cal.add(Calendar.DATE, day);
			}
			if (hour != 0) {
				cal.add(Calendar.HOUR_OF_DAY, hour);
			}
			if (minute != 0) {
				cal.add(Calendar.MINUTE, minute);
			}
			if (second != 0) {
				cal.add(Calendar.SECOND, second);
			}
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
				JWTVerifier verifier = JWT.require(algorithm).withIssuer("SERVICE").build(); // Reusable
				jwt = verifier.verify(token);
			} catch (JWTVerificationException exception) {
				exception.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			return jwt;
		}

		/**
		 * @Title: getDataIdFromToken
		 * @Description: 从已验证的token中获取参数data
		 * @param: @param djwt
		 * @param: @return
		 * @return: String
		 * @throws
		 */
		public static JSONObject getDataFromToken(DecodedJWT djwt) {
			Claim claim = djwt.getClaim("data");
			String data = claim.asString();
			JSONObject jd = new JSONObject();
			if (StringUtils.isNotBlank(data)) {
				jd = JSONObject.parseObject(data);
			}
			return jd;
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
				Claim claim = djwt.getClaim("data");
				String data = claim.asString();
				if (StringUtils.isNotBlank(data)) {
					jd = JSONObject.parseObject(data);
				}
			}
			return jd;
		}

		public static void main(String[] args) {
			JSONObject data = new JSONObject();
			data.put("userId", 2);
			String token = JWTUtils.createTokenWithClaim(data);
			System.out.println(token);

			DecodedJWT djwt = JWTUtils.decodeToken(token);
			if (djwt != null) {
				System.out.println("验证成功");
				//获取参数
				JSONObject jd = JWTUtils.getDataFromToken(djwt);
				System.out.println(jd.getInteger("userId"));
			}
		}
}
