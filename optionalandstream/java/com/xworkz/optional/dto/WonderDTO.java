package com.xworkz.optional.dto;

import java.util.Optional;

public class WonderDTO {

	private String name;
	private Optional<String> hesaru;
	private String palace;
	private Period period;

	public enum Period {
		AC, BC
	}

	public WonderDTO() {

	}

	public WonderDTO(String name, String palace, Period period) {
		this.name = name;
		this.palace = palace;
		this.period = period;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "WonderDTO [name=" + name + ", hesaru=" + hesaru + ", palace=" + palace + ", period=" + period + "]";
	}

	public Optional<String> getHesaru() {
		return hesaru;
	}

	public String getPalace() {
		return palace;
	}

	public Period getPeriod() {
		return period;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHesaru(Optional<String> hesaru) {
		this.hesaru = hesaru;
	}

	public void setPalace(String palace) {
		this.palace = palace;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

}
