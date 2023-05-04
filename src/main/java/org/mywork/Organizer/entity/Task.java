package org.mywork.Organizer.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task
{
    private Integer id;
    private Integer priorityId;
    private String description;
    private Data data;
}
