package com.stringconcat.dto;

import java.util.Objects;

public class NamedBaseEntityDto extends BaseEntityDto {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		NamedBaseEntityDto that = (NamedBaseEntityDto) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), name);
	}
}
