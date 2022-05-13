package com.maktab.homeService;

import com.maktab.homeService.entity.*;
import com.maktab.homeService.entity.enums.CustomerStatus;
import com.maktab.homeService.entity.enums.OrderStatus;
import com.maktab.homeService.entity.enums.ProficientStatus;
import com.maktab.homeService.service.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
public class HomeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeServiceApplication.class, args);
	}


	@Component
	class onStart implements ApplicationRunner{

		private CustomerServiceImpl customerService;
		private CategoryServiceImpl categoryService;
		private SpecialtyServiceImpl specialtyService;
		private ProficientServiceImpl proficientService;
		private OrderServiceImpl orderService;
		private OfferServiceImpl offerService;


		onStart(CustomerServiceImpl service, CategoryServiceImpl categoryService, SpecialtyServiceImpl specialtyService, ProficientServiceImpl proficientService, OrderServiceImpl orderService, OfferServiceImpl offerService) {
			this.customerService = service;
			this.categoryService = categoryService;
			this.specialtyService = specialtyService;
			this.proficientService = proficientService;
			this.orderService = orderService;
			this.offerService = offerService;
		}


		@Override
		public void run(ApplicationArguments args) {
////			service.save(new Person(null,"sina@gmail.com","sina","glm","1717",20));
//			service.save(new Customer(null,"sina@gamil.com","sina","glm","1717", CustomerStatus.NEW,0));
//			System.out.println(service.findById(1));
//			System.out.println("done");

			Category cat1 = new Category(null,"A");
			Category cat2 = new Category(null,"B");

			categoryService.save(cat1);
			categoryService.save(cat2);

//			System.out.println(cat2);

			Specialty serv1 = new Specialty(null,"lole keshy","khfegag",cat1,20);
			Specialty serv2 = new Specialty(null,"kaj kary","khfegag",cat1,22);
			Specialty serv3 = new Specialty(null,"galy shoyy","khfegag",cat2,25);
			Specialty serv4 = new Specialty(null,"nezafat manzel","khfegag",cat2,15);

			specialtyService.save(serv1);
			specialtyService.save(serv2);
			specialtyService.save(serv3);
			specialtyService.save(serv4);

			Customer c1 = new Customer(null,"sssss@gmail.com","sina","glm","1717", CustomerStatus.NEW,20);
			Customer c2 = new Customer(null,"helo@gmail.com","hello","ddd","1717", CustomerStatus.NEW,20);
			Customer c3 = new Customer(null,"akbar@gmail.com","akbar","jll","1717", CustomerStatus.NEW,20);
			Customer c4 = new Customer(null,"bager@gmail.com","bager","o090","1717", CustomerStatus.NEW,20);

			customerService.save(c1);
			customerService.save(c2);
			customerService.save(c3);
			customerService.save(c4);

			Proficient pro1 = new Proficient(null,"mohammad@gmail.com","mohammad","ashena","1919",0,new File(""), ProficientStatus.ACCEPTED, new HashSet<Specialty>(Arrays.asList(serv1,serv4)),0.0);
			Proficient pro2 = new Proficient(null,"Ali@gmail.com","Ali","sadegy","1919",0,new File(""), ProficientStatus.ACCEPTED, new HashSet<Specialty>(Arrays.asList(serv2,serv3)),0.0);

			proficientService.save(pro1);
			proficientService.save(pro2);


			//ordering -----------------------------

			Order order1 = new Order(null,c1,null,serv1,22,"lole kesh khob mikam", OrderStatus.WAITING_FOR_PROFICIENT_OFFER);
			Order order2 = new Order(null,c2,null,serv4,22,"khonam tamiz beshe", OrderStatus.WAITING_FOR_PROFICIENT_OFFER);
			Order order3 = new Order(null,c4,null,serv3,22,"galy daram beshory", OrderStatus.WAITING_FOR_PROFICIENT_OFFER);

			orderService.save(order1);
			orderService.save(order2);
			orderService.save(order3);


//			offering

			Offer offer1 = new Offer(null,order1,"i can do it",pro1,new Date(2022-5-13),22,2.5);
			Offer offer2 = new Offer(null,order3,"i can do it",pro2,new Date(2022-5-13),26,5.5);
			Offer offer3 = new Offer(null,order3,"i can do it",pro1,new Date(2022-5-13),20,2.5);

			offerService.save(offer1);
			offerService.save(offer2);
			offerService.save(offer3);

			System.out.println(orderService.findAll());


		}
	}
}
