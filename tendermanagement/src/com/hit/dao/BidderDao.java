<<<<<<< HEAD
package com.hit.dao;

import java.util.List;

import com.hit.beans.BidderBean;

public interface BidderDao {

    public String acceptBid(String applicationId,String tenderId,String vendorId);
	
	public String rejectBid(String applicationId);
	
	public String bidTender(String tenderId, String vendorId,String bidAmount,String deadline);
	
	public List<BidderBean> getAllBidsOfaTender(String tenderId);
	
	public List<BidderBean> getAllBidsOfaVendor(String vendorId);
	
	
}
=======
package com.hit.dao;

import java.util.List;

import com.hit.beans.BidderBean;

public interface BidderDao {

    public String acceptBid(String applicationId,String tenderId,String vendorId);
	
	public String rejectBid(String applicationId);
	
	public String bidTender(String tenderId, String vendorId,String bidAmount,String deadline);
	
	public List<BidderBean> getAllBidsOfaTender(String tenderId);
	
	public List<BidderBean> getAllBidsOfaVendor(String vendorId);
	
	
}
>>>>>>> 6261fa845ae58e03bfd663e1eb46fea81513eda0
