package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("Enter the Choice: "
					+ "\n 1.Insert a customer"
					+"\n 2.Retreive a particular customer"
					+"\n 3.update a customer"
					+"\n 4.Delete a customer"
					+"\n -1.Exit");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
				{
					//create operation
					customer.setCust_ID(103);
					customer.setName("supriya");
					customer.setProduct_price(800.10);
					service.addCustomer(customer);
					System.out.println("Customer added Successfully");
				}
				break;
				case 2:
				{
					//retreive 
					customer=service.getCustomerById(s.nextInt());
					System.out.println("Customer ID: "+customer.getCust_ID());
					System.out.println("Customer Name: "+customer.getName());
					System.out.println("Customer Product-price: "+customer.getProduct_price());
					
				}
				break;
				case 3:
				{
					//updation
					System.out.println("Enter the CustID for the updation");
					customer=service.getCustomerById(s.nextInt());
					customer.setName("Mohan Gabhale");
					service.updateCustomer(customer);
					System.out.println("Customer updated Successfully");
				}
				break;
				case 4:
				{
					//deletion
					System.out.println("Enter the CustID for the deletion");
					customer=service.getCustomerById(s.nextInt());
					service.deleteCustomer(customer);
					System.out.println("Customer deleted Successfully");
					
				}
				break;
				
				case -1:
				{
					System.out.println("Thank You");
				}
				break;
				default:
					System.out.println("Enter the correct choice");
					break;
			}
			
		}while(choice>0);
	}
}				
		
		