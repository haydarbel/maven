package be.vdab.goededoel.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	public BigDecimal getOpgebracht() {
		return opgebracht;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GoedeDoel)) return false;
		GoedeDoel goedeDoel = (GoedeDoel) o;
		return naam.equalsIgnoreCase(goedeDoel.naam);
	}

	@Override
	public int hashCode() {
		return Objects.hash(naam);
	}
}
