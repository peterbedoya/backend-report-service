package com.apps.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parameter")
public class Parameter {
    
@Id
@Column(name="service_report_id", nullable = false)
private Integer parameterId;

@Column(name="type_parameter", nullable = false)
private Integer typeParameter;

@Column(name="start_time", nullable = false)
private Integer startTime;

@Column(name="end_time", nullable = false)
private Integer endTime;


public Parameter() {
}


public Parameter(Integer parameterId, Integer typeParameter, Integer startTime, Integer endTime) {
    this.parameterId = parameterId;
    this.typeParameter = typeParameter;
    this.startTime = startTime;
    this.endTime = endTime;
}

public Integer getParameterId() {
    return parameterId;
}

public void setParameterId(Integer parameterId) {
    this.parameterId = parameterId;
}

public Integer getTypeParameter() {
    return typeParameter;
}

public void setTypeParameter(Integer typeParameter) {
    this.typeParameter = typeParameter;
}

public Integer getStartTime() {
    return startTime;
}

public void setStartTime(Integer startTime) {
    this.startTime = startTime;
}

public Integer getEndTime() {
    return endTime;
}

public void setEndTime(Integer endTime) {
    this.endTime = endTime;
}

@Override
public String toString() {
    return "Parameter [endTime=" + endTime + ", parameterId=" + parameterId + ", startTime=" + startTime
            + ", typeParameter=" + typeParameter + "]";
}








}
