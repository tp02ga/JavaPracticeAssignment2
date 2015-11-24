package net.javavideotutorials.assignment2.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import net.javavideotutorials.assignment2.Human.Employee;
import net.javavideotutorials.assignment2.Human.Person;
import net.javavideotutorials.assignment2.Structure.Google;
import net.javavideotutorials.assignment2.Structure.Microsoft;

import org.junit.Before;
import org.junit.Test;

public class Tests 
{
  List<Person> employees = new ArrayList<Person>();
  
  @Before
  public void init ()
  {
    Person anEmployee = new Employee();
    anEmployee.setName("Trevor Page");
    anEmployee.setSex("Male");
    Calendar cal = Calendar.getInstance();
    cal.set(1983, 0, 1);
    anEmployee.setBirthday(cal.getTime());
    ((Employee)anEmployee).setJobTitle("Sr. Software Engineer");
    ((Employee)anEmployee).setOrganization(new Google("Google"));
    employees.add(anEmployee);
    
    anEmployee = new Employee();
    anEmployee.setName("Jane Doe");
    anEmployee.setSex("Female");
    anEmployee.setBirthday(cal.getTime());
    ((Employee)anEmployee).setJobTitle("Sr. Software Engineer");
    ((Employee)anEmployee).setOrganization(new Google("Google"));
    employees.add(anEmployee);
    
    anEmployee = new Employee();
    anEmployee.setName("Trevor Page");
    anEmployee.setSex("Male");
    anEmployee.setBirthday(cal.getTime());
    ((Employee)anEmployee).setJobTitle("Sr. Software Engineer");
    ((Employee)anEmployee).setOrganization(new Google("Google"));
    employees.add(anEmployee);
    
    anEmployee = new Employee();
    anEmployee.setName("Trevor Page");
    anEmployee.setSex("Male");
    anEmployee.setBirthday(cal.getTime());
    ((Employee)anEmployee).setJobTitle("Sr. Software Engineer");
    ((Employee)anEmployee).setOrganization(new Microsoft("Microsoft"));
    employees.add(anEmployee);
  }
  
  @Test
  public void ensure_toString_method_is_properly_coded()
  {
    String message = "Name: Trevor Page, Sex: Male" +
    "\nJob Title: Sr. Software Engineer, Organization: Google";

    assertThat(employees.get(0).toString(), is(message));
  }

  @Test
  public void ensure_equals_method_is_properly_coded ()
  {
    assertTrue(employees.get(0).equals(employees.get(2)));
    assertFalse(employees.get(0).equals(employees.get(1)));
    assertFalse(employees.get(0).equals(employees.get(3)));
  }
}
