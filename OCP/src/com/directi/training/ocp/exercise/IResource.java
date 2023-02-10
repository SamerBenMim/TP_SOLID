package com.directi.training.ocp.exercise;

public interface IResource {

    public int allocate();

    public void free(int resourceId);

    public void markSlotFree(int resourceId);

    public void markSlotBusy(int resourceId);

    public int findFreeSlot();

}