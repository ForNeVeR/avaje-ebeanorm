package com.avaje.tests.model.types;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.*;

@Entity
public class SomeNewTypesBean {

  @Id
  Long id;

  @Version
  Long version;

  DayOfWeek dayOfWeek;

  Month month;

  Year year;

  YearMonth yearMonth;

  LocalDate localDate;

  LocalDateTime localDateTime;

  OffsetDateTime offsetDateTime;

  ZonedDateTime zonedDateTime;

  Instant instant;

  ZoneId zoneId;

  ZoneOffset zoneOffset;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public Month getMonth() {
    return month;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  public Year getYear() {
    return year;
  }

  public void setYear(Year year) {
    this.year = year;
  }

  public YearMonth getYearMonth() {
    return yearMonth;
  }

  public void setYearMonth(YearMonth yearMonth) {
    this.yearMonth = yearMonth;
  }

  public LocalDate getLocalDate() {
    return localDate;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  public void setLocalDateTime(LocalDateTime localDateTime) {
    this.localDateTime = localDateTime;
  }

  public OffsetDateTime getOffsetDateTime() {
    return offsetDateTime;
  }

  public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
    this.offsetDateTime = offsetDateTime;
  }

  public ZonedDateTime getZonedDateTime() {
    return zonedDateTime;
  }

  public void setZonedDateTime(ZonedDateTime zonedDateTime) {
    this.zonedDateTime = zonedDateTime;
  }

  public Instant getInstant() {
    return instant;
  }

  public void setInstant(Instant instant) {
    this.instant = instant;
  }

  public ZoneId getZoneId() {
    return zoneId;
  }

  public void setZoneId(ZoneId zoneId) {
    this.zoneId = zoneId;
  }

  public ZoneOffset getZoneOffset() {
    return zoneOffset;
  }

  public void setZoneOffset(ZoneOffset zoneOffset) {
    this.zoneOffset = zoneOffset;
  }
}
