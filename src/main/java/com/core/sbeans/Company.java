package com.core.sbeans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")

@ConfigurationProperties(prefix = "org.nt")
public class Company {

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", type=" + type + ", otherLocation="+ otherLocation+ "]";
	}

	@Setter
	@Getter
    private String name;

	@Setter
    @Getter
    private String location;

	@Setter
	@Getter
	private String type;


	@Value("${org.gt.location}")
	private String otherLocation;

}
