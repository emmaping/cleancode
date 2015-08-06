package BootCamp.cleancode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketTest
{

  @Test
  public void parkingHours_is_2_given_start_7_end_9()
  {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    LocalDateTime startTime = LocalDateTime.parse("2015-11-25 07:00:00", formatter);
    LocalDateTime endTime = LocalDateTime.parse("2015-11-25 09:00:00", formatter);
    Ticket ticket = new Ticket(startTime);
    ticket.setEndTime(endTime);
    Assert.assertEquals(ticket.calculateDuration(), 2);
  }

  @Test
  public void parkingHours_is_0_given_endtime_not_set()
  {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    LocalDateTime startTime = LocalDateTime.parse("2015-11-25 07:00:00", formatter);
    Ticket ticket = new Ticket(startTime);
    Assert.assertEquals(ticket.calculateDuration(), 0);
  }
}
