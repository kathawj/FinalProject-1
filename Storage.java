

public class Storage {
	 private Items [] item;

	    public Storage(int size)
	    {
	        item = new Items[size];
	    }

	    public void addItem(Items i)
	    {
	        //this will find a empty spot in the array
	        for(int x = 0; x < item.length; x++)
	        {
	            if(item[x] == null)
	            {
	                item [x] = i;
	                break;
	            }
	        }
	    }
	    
	    public boolean searchItem(String sr)
	    {
	        for(int i = 0; i < item.length; i++)
	        {
	            if(item[i] != null)
	            {
	               
	                if(item[i].getName().equals(sr))
	                {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    public boolean removeItem(Items r)
	    {
	        for(int i = 0; i < item.length; i++)
	        {
	            if(item[i] != null)
	            {
	                if(item[i].toString().equals(r.toString()))
	                {
	                    //this should remove an item
	                    item[i] = null;
	                    return true;
	                }
	            }
	        }
	        return false; // this will show that an item is not found
	    }

}
