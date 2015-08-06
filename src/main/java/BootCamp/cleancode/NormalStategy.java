/********************************************************************
 * File Name:    NormalStategy.java
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
public class NormalStategy implements ParkingStategy
{
  /* (non-Javadoc)
   * @see BootCamp.cleancode.ParkingStategy1#getParkingLot(java.util.List)
   */
  public ParkingLot getParkingLot(List<ParkingLot> parkingLots)
  {
    ParkingLot choosenParkingLot = null;
    for (ParkingLot parkingLot : parkingLots)
    {
      if (parkingLot.getAvailableParkLot() > 0)
      {
        choosenParkingLot = parkingLot;
        break;
      }
    }
    return choosenParkingLot;
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
