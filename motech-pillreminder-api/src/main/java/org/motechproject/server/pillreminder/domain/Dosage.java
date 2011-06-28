package org.motechproject.server.pillreminder.domain;

import java.util.Set;
import java.util.UUID;

public class Dosage{
    private String id;
    private int startHour;
    private int startMinute;
    private Set<Medicine> medicines;
    private boolean reminded;

    public Dosage() {
    }

    public Dosage(int startHour, int startMinute, Set<Medicine> medicines) {
        this.id = UUID.randomUUID().toString();
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.medicines = medicines;
    }

    public String getId() {
        return id;
    }

    public Set<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicine> medicines) {
        this.medicines = medicines;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public boolean isReminded() {
        return reminded;
    }

    public void setReminded(boolean reminded) {
        this.reminded = reminded;
    }
}