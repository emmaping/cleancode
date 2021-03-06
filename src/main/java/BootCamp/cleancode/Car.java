/********************************************************************
 * File Name:    Car.java
 *
 * Date Created: Jul 2, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Car
{
  private String id;
  private Integer location = -1;

  public String getId()
  {
    return id;
  }

  public Car(String id)
  {
    super();
    this.id = id;
  }

  public Integer getLocation()
  {
    return location;
  }

  public void setLocation(Integer location)
  {
    this.location = location;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Car other = (Car) obj;
    if (id == null)
    {
      if (other.id != null)
        return false;
    }
    else if (!id.equals(other.id))
      return false;
    return true;
  }

}
