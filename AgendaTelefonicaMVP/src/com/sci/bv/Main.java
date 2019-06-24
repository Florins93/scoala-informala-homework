package com.sci.bv;

public class Main {

    public static void main(String[] args) {
	Model model = new Model("PBData.FILE");
	Presenter presenter = new Presenter(model);
	View view = new View(presenter);

	view.showMenu();
	//model.getPhoneBook().writeContactsToFile();

    }
}
