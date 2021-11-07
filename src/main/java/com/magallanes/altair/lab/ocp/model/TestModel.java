package com.magallanes.altair.lab.ocp.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TestModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String appName;
	private String autor;
	
}
