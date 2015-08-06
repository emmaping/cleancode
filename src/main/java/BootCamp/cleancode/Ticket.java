/********************************************************************
 * File Name:    Ticket.java
 *
 * Date Created: Jul 2, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.time.LocalDateTime;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Ticket
{
  private LocalDateTime startTime;

  private LocalDateTime endTime;

  public Ticket(LocalDateTime startTime)
  {
    super();
    this.startTime = startTime;
  }

  public void setEndTime(LocalDateTime endTime)
  {
    this.endTime = endTime;
  }

  public long calculateDuration()
  {
    if (endTime != null)
    {
      return java.time.Duration.between(startTime, endTime).toHours();
    }
    return 0;
  }

}
