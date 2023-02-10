package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    

    public int allocate(IResource iResource)
    {
        return iResource.allocate();

    }

    public void free(IResource iResource , int resourceId)
    {

         iResource.free(resourceId);

    }


}
