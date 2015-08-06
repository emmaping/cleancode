/********************************************************************
 * File Name:    SuperSmartStrategy.java
 *
 * Date Created: Jul 10, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class SuperSmartStrategy implements ParkingStategy
{

  public ParkingLot getParkingLot(List<ParkingLot> parkingLots)
  {
    ParkingLot finalParkingLot = null;
    int maxCapabitity = 0;
    for (ParkingLot parkingLot : parkingLots)
    {
      if (parkingLot.getAvailableParkLot() * 100 / parkingLot.PARKING_CAPABILITY > maxCapabitity)
      {
        finalParkingLot = parkingLot;
        maxCapabitity = parkingLot.getAvailableParkLot();
      }
    }
    return finalParkingLot;
  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
