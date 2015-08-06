/********************************************************************
 * File Name:    ParkingLog.java
 *
 * Date Created: Jul 2, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ParkingLot
{
  public static int PARKING_CAPABILITY;
  private static Map<Integer, Car> parkingLot = new HashMap<Integer, Car>();
  private String name = null;
  private int parkingNumber = 0;

  public ParkingLot(int maxium, String name)
  {
    this.name = name;
    PARKING_CAPABILITY = maxium;
    for (int i = 1; i <= PARKING_CAPABILITY; i++)
    {
      parkingLot.put(i, null);
    }
  }

  public ParkingLot(int maxium)
  {
    this(maxium, "parkingLot");
  }

  public Integer park(Car car)
  {
    Integer parkId = null;
    for (Entry<Integer, Car> lot : parkingLot.entrySet())
    {
      if (lot.getValue() == null)
      {
        lot.setValue(car);
        parkingNumber++;
        parkId = lot.getKey();
        break;
      }
    }
    return parkId;
  }

  public Car getCar(String carId)
  {
    Car car = null;
    for (Entry<Integer, Car> lot : parkingLot.entrySet())
    {
      if (lot.getValue() != null && carId.equals(lot.getValue().getId()))
      {
        car = lot.getValue();
        lot.setValue(null);
        parkingNumber--;
        break;
      }
    }
    return car;
  }

  public Car getCar(int parkId)
  {
    Car car = null;
    for (Entry<Integer, Car> lot : parkingLot.entrySet())
    {
      if (lot.getKey() == parkId)
      {
        car = lot.getValue();
        lot.setValue(null);
        parkingNumber--;
        break;
      }
    }
    return car;
  }

  public int getAvailableParkLot()
  {
    // TODO Auto-generated method stub
    return PARKING_CAPABILITY - parkingNumber;
  }

  public String getName()
  {
    // TODO Auto-generated method stub
    return name;
  }
}
