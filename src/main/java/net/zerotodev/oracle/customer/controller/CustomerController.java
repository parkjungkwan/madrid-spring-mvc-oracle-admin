package net.zerotodev.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.zerotodev.oracle.customer.domain.CustomerDto;
import net.zerotodev.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController{
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String save(CustomerDto t) {
		customerService.save(t);
		System.out.println("*****Save Complete : " + t.toString());
		return "Success";
	}
	@RequestMapping(value="/detail/custId", method=RequestMethod.POST)
	public CustomerDto findById(@RequestParam Integer custId) {
		System.out.println("*****Select Complete : " + customerService.findById(custId).toString());
		return customerService.findById(custId);
		
	}
	@RequestMapping(value="/list/custName", method=RequestMethod.POST)
	public List<CustomerDto> findByCustName(@RequestParam String custName) {
		List<CustomerDto> list = customerService.findByCustName(custName);
		forPrint(list);
		return list;
	}
	public void forPrint(List<CustomerDto> list) {
		System.out.println("*****Select Complete : ");
		for(CustomerDto c : list) {
			System.out.println(c.toString());
		}
	}
	@RequestMapping(value="/list/address", method=RequestMethod.POST)
	public List<CustomerDto> findByAddress(@RequestParam String address) {
		List<CustomerDto> list = customerService.findByAddress(address);
		forPrint(list);
		return list;
	}
	@RequestMapping(value="/list/phone", method=RequestMethod.POST)
	public List<CustomerDto> findByPhone(@RequestParam String phone) {
		List<CustomerDto> list = customerService.findByPhone(phone);
		forPrint(list);
		return list;

	}@RequestMapping(value="/list", method=RequestMethod.POST)
	public List<CustomerDto> findAll() {
		List<CustomerDto> list = customerService.findAll();
		forPrint(list);
		return list;		
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(CustomerDto t) {
		customerService.update(t);
		System.out.println("*****Update Complete: " + t.toString());
		return "Success";		
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@RequestParam Integer custId) {
		customerService.delete(custId);
		System.out.println("*****Delete Complete: " + custId);
		return "Success";
	}
}
