package net.javavideotutorials.assignment2.Human;

import java.util.Date;

public abstract class Person 
{
  public abstract String getName();
  public abstract String getSex();
  public abstract void setName(String name);
  public abstract void setSex(String sex);
  public abstract void setBirthday(Date birthdate);
  public abstract Date getBirthday();
  
  @Override
  public String toString() {
    return "Name: " + getName() + ", Sex: " + getSex() + "\n";
  }
}
