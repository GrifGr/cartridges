package grifgr.cartridges.filter;

import java.time.LocalDate;
import java.util.Objects;

import grifgr.cartridges.domain.ModelCartridge;
import javax.annotation.Generated;

import org.springframework.format.annotation.DateTimeFormat;

public class CartridgesFilter {

	private int number;
	private ModelCartridge model;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateGiveToUser;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateGetFromUser;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateGetFromService;

	@Generated("SparkTools")
	private CartridgesFilter(Builder builder) {
		this.number = builder.number;
		this.model = builder.model;
		this.dateGiveToUser = builder.dateGiveToUser;
		this.dateGetFromUser = builder.dateGetFromUser;
		this.dateGetFromService = builder.dateGetFromService;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ModelCartridge getModel() {
		return model;
	}

	public void setModel(ModelCartridge model) {
		this.model = model;
	}

	public LocalDate getDateGiveToUser() {
		return dateGiveToUser;
	}

	public void setDateGiveToUser(LocalDate dateGiveToUser) {
		this.dateGiveToUser = dateGiveToUser;
	}

	public LocalDate getDateGetFromUser() {
		return dateGetFromUser;
	}

	public void setDateGetFromUser(LocalDate dateGetFromUser) {
		this.dateGetFromUser = dateGetFromUser;
	}

	public LocalDate getDateGetFromService() {
		return dateGetFromService;
	}

	public void setDateGetFromService(LocalDate dateGetFromService) {
		this.dateGetFromService = dateGetFromService;
	}

	@Override
	public String toString() {
		return "CartridgesFilter [number=" + number + ", model=" + model + ", dateGiveToUser=" + dateGiveToUser
				+ ", dateGetFromUser=" + dateGetFromUser + ", dateGetFromService=" + dateGetFromService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateGetFromService, dateGetFromUser, dateGiveToUser, model, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartridgesFilter other = (CartridgesFilter) obj;
		return Objects.equals(dateGetFromService, other.dateGetFromService)
				&& Objects.equals(dateGetFromUser, other.dateGetFromUser)
				&& Objects.equals(dateGiveToUser, other.dateGiveToUser) && Objects.equals(model, other.model)
				&& number == other.number;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private int number;
		private ModelCartridge model;
		private LocalDate dateGiveToUser;
		private LocalDate dateGetFromUser;
		private LocalDate dateGetFromService;

		private Builder() {
		}

		public Builder withNumber(int number) {
			this.number = number;
			return this;
		}

		public Builder withModel(ModelCartridge model) {
			this.model = model;
			return this;
		}

		public Builder withDateGiveToUser(LocalDate dateGiveToUser) {
			this.dateGiveToUser = dateGiveToUser;
			return this;
		}

		public Builder withDateGetFromUser(LocalDate dateGetFromUser) {
			this.dateGetFromUser = dateGetFromUser;
			return this;
		}

		public Builder withDateGetFromService(LocalDate dateGetFromService) {
			this.dateGetFromService = dateGetFromService;
			return this;
		}

		public CartridgesFilter build() {
			return new CartridgesFilter(this);
		}
	}
}
