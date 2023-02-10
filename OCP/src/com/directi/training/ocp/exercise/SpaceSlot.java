package com.directi.training.ocp.exercise;

public class SpaceSlot  implements IResource {


    public int allocate()
    {
        int resourceId;
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId)
    {
        markSlotFree(resourceId);
    }

    public void markSlotFree(int resourceId)
    {

    }

    public void markSlotBusy(int resourceId)
    {
    }

    public int findFreeSlot()
    {
        return 0;
    }

   
    
}
