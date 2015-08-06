/********************************************************************
 * File Name:    ParkingBoy.java
 *
 * Date Created: Jul 2, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ParkingBoy
{
  protected List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
  private String name = null;

  ParkingStategy parkingStrategy;

  public void addParkingLot(ParkingLot parkingLot)
  {
    this.parkingLots.add(parkingLot);
  }

  public void setParkingStrategy(ParkingStategy parkingStrategy)
  {
    this.parkingStrategy = parkingStrategy;
  }

  public ParkingBoy(int i)
  {
    this(i, "ParkingBoy");

  }

  public ParkingBoy(int i, String name)
  {
    this.name = name;
    for (int j = 0; j < i; j++)
    {
      ParkingLot parkingLot = new ParkingLot(50, "parkinglot" + j);
      parkingLots.add(parkingLot);
    }

  }

  public ParkTicket park(Car car)
  {
    ParkingLot choosenParkingLot = getParkingLot();
    return storeCarToParklog(car, choosenParkingLot);
  }

  protected ParkingLot getParkingLot()
  {
    return parkingStrategy.getParkingLot(parkingLots);
  }

  // protected static ParkingLot normalStrtegy(ParkingStategy normalStategy, List<ParkingLot> parkingLots)
  // {
  // ParkingLot choosenParkingLot = null;
  // for (ParkingLot parkingLot : parkingLots)
  // {
  // if (parkingLot.getAvailableParkLot() > 0)
  // {
  // choosenParkingLot = parkingLot;
  // break;
  // }
  // }
  // return choosenParkingLot;
  // }

  protected ParkTicket storeCarToParklog(Car car, ParkingLot parkingLot)
  {
    ParkTicket parkTicket;
    Integer parkId = parkingLot.park(car);
    parkTicket = new ParkTicket();
    parkTicket.setCarId(car.getId());
    parkTicket.setParkingLot(parkingLot);
    parkTicket.setParkId(parkId);
    return parkTicket;
  }

  public ParkingLot getParkingLot(int i)
  {
    // TODO Auto-generated method stub
    return parkingLots.get(i - 1);
  }

  public Car getCar(ParkTicket parkTicket)
  {
    ParkingLot parkingLot = parkTicket.getParkingLot();
    return parkingLot.getCar(parkTicket.getCarId());
  }

  public String printParkinglots()
  {
    StringBuilder ret = new StringBuilder();
    System.out.println(this.name);
    ret.append(this.name);
    for (int i = 0; i < parkingLots.size(); i++)
    {
      System.out.println(parkingLots.get(i).getName());
      ret.append(parkingLots.get(i).getName());
    }
    return ret.toString();
  }
}
