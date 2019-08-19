package hello.domain;

import java.time.Instant;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;


@Measurement(name = "h2o_feet")
public class H2oFeet {

	@Column(name="id")
	private String id;
	@Column(name="level")
	private double level;
	@Column(name = "time")
	private Instant time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}
}
