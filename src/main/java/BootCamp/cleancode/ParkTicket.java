/********************************************************************
 * File Name:    ParkTicket.java
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
public class ParkTicket
{
  private ParkingLot parkingLot;
  private Integer parkId;
  private String carId;

  public ParkingLot getParkingLot()
  {
    return parkingLot;
  }

  public void setParkingLot(ParkingLot parkingLot)
  {
    this.parkingLot = parkingLot;
  }

  public Integer getParkId()
  {
    return parkId;
  }

  public void setParkId(Integer parkId)
  {
    this.parkId = parkId;
  }

  public String getCarId()
  {
    return carId;
  }

  public void setCarId(String carId)
  {
    this.carId = carId;
  }

}
