package com.weather.tempConverter;

public class HistoricalData {
	private String date;
	private int fLow;
	private int fHigh;
	
	public HistoricalData() {
		
	}
	
	public HistoricalData(String date, int fLow, int fHigh) {
		this.date = date;
		this.fLow = fLow;
		this.fHigh = fHigh;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getfLow() {
		return (int) ((fLow - 32) / 1.800000);
	}

	public void setfLow(int fLow) {
		this.fLow = fLow;
	}

	public int getfHigh() {
		return (int) ((fHigh - 32) / 1.800000);
	}

	public void setfHigh(int fHigh) {
		this.fHigh = fHigh;
	}
}
