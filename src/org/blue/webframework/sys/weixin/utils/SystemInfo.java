package org.blue.webframework.sys.weixin.utils;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.sun.management.OperatingSystemMXBean;

public class SystemInfo {

	public static class MonitorInfoBean {
		/** 可使用内存. */
		private long totalMemory;

		/** 剩余内存. */
		private long freeMemory;

		/** 最大可使用内存. */
		private long maxMemory;

		/** 总的物理内存. */
		private long totalMemorySize;

		/** 剩余的物理内存. */
		private long freePhysicalMemorySize;

		/** 已使用的物理内存. */
		private long usedMemory;

		/** 线程总数. */
		private int totalThread;

		/** cpu使用率. */
		private double cpuRatio;

		private long diskFreeSpace;
		private long diskUsableSpace;
		private long diskTotalSpace;

		public long getDiskFreeSpace() {
			return diskFreeSpace;
		}

		public long getDiskUsableSpace() {
			return diskUsableSpace;
		}

		public long getDiskTotalSpace() {
			return diskTotalSpace;
		}

		public long getFreeMemory() {
			return freeMemory;
		}

		public void setFreeMemory(long freeMemory) {
			this.freeMemory = freeMemory;
		}

		public long getFreePhysicalMemorySize() {
			return freePhysicalMemorySize;
		}

		public void setFreePhysicalMemorySize(long freePhysicalMemorySize) {
			this.freePhysicalMemorySize = freePhysicalMemorySize;
		}

		public long getMaxMemory() {
			return maxMemory;
		}

		public void setMaxMemory(long maxMemory) {
			this.maxMemory = maxMemory;
		}

		public long getTotalMemory() {
			return totalMemory;
		}

		public void setTotalMemory(long totalMemory) {
			this.totalMemory = totalMemory;
		}

		public long getTotalMemorySize() {
			return totalMemorySize;
		}

		public void setTotalMemorySize(long totalMemorySize) {
			this.totalMemorySize = totalMemorySize;
		}

		public int getTotalThread() {
			return totalThread;
		}

		public void setTotalThread(int totalThread) {
			this.totalThread = totalThread;
		}

		public long getUsedMemory() {
			return usedMemory;
		}

		public void setUsedMemory(long usedMemory) {
			this.usedMemory = usedMemory;
		}

		public double getCpuRatio() {
			return cpuRatio;
		}

		public void setCpuRatio(double cpuRatio) {
			this.cpuRatio = cpuRatio;
		}
	}

	/**
	 * 获得当前的监控对象.
	 * 
	 * @return 返回构造好的监控对象
	 * @throws Exception
	 * @author GuoHuang
	 */
	public static MonitorInfoBean getMonitorInfoBean() {
		int kb = 1024;

		// 可使用内存
		long totalMemory = Runtime.getRuntime().totalMemory() / kb;
		// 剩余内存
		long freeMemory = Runtime.getRuntime().freeMemory() / kb;
		// 最大可使用内存
		long maxMemory = Runtime.getRuntime().maxMemory() / kb;

		OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

		// 总的物理内存
		long totalMemorySize = osmxb.getTotalPhysicalMemorySize() / kb;
		// 剩余的物理内存
		long freePhysicalMemorySize = osmxb.getFreePhysicalMemorySize() / kb;
		// 已使用的物理内存
		long usedMemory = (osmxb.getTotalPhysicalMemorySize() - osmxb.getFreePhysicalMemorySize()) / kb;

		// 获得线程总数
		ThreadGroup parentThread;
		for (parentThread = Thread.currentThread().getThreadGroup(); parentThread.getParent() != null; parentThread = parentThread.getParent())
			;
		int totalThread = parentThread.activeCount();

		File win = new File("e:\\");

		long freespace = win.getFreeSpace();
		long usablespace = win.getUsableSpace();
		long totalspace = win.getTotalSpace();

		// 构造返回对象
		MonitorInfoBean infoBean = new MonitorInfoBean();
		infoBean.setFreeMemory(freeMemory);
		infoBean.setFreePhysicalMemorySize(freePhysicalMemorySize);
		infoBean.setMaxMemory(maxMemory);
		infoBean.setTotalMemory(totalMemory);
		infoBean.setTotalMemorySize(totalMemorySize);
		infoBean.setTotalThread(totalThread);
		infoBean.setUsedMemory(usedMemory);
		infoBean.diskFreeSpace = freespace / kb;
		infoBean.diskUsableSpace = usablespace / kb;
		infoBean.diskTotalSpace = totalspace / kb;
		return infoBean;
	}


	public static String getDisplayString(long bytes) {
		String[] unints = new String[] { "KB", "MB", "GB" };
		BigDecimal d1024 = new BigDecimal(1024);
		BigDecimal result = new BigDecimal(bytes);

		int i = 0;
		while (bytes > 990) {
			result = result.divide(d1024);

			bytes /= 1024;
			i++;
		}
		result=result.setScale(2,RoundingMode.HALF_UP);
		return  result.toString()  + unints[i];
	}
}
