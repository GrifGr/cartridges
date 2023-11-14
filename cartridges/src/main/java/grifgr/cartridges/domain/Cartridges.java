package grifgr.cartridges.domain;

import java.time.LocalDate;

public class Cartridges {

	private int id;
	private int number;
	private ModelCartridge model;
	private LocalDate dateGiveToUser;
	private LocalDate dateGetFromUser;
	private LocalDate dateGetFromService;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Cartridges [id=" + id + ", number=" + number + ", model=" + model + ", dateGiveToUser=" + dateGiveToUser
				+ ", dateGetFromUser=" + dateGetFromUser + ", dateGetFromService=" + dateGetFromService + "]";
	}
}
