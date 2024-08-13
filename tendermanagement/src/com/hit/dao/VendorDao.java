<<<<<<< HEAD
package com.hit.dao;

import java.util.List;

import com.hit.beans.VendorBean;

public interface VendorDao {
	
	public String registerVendor(VendorBean vendor);
	
	public List<VendorBean> getAllVendors();
	
	public boolean validatePassword(String vendorId,String password);
	
	public String updateProfile(VendorBean vendor);
	
	public String changePassword(String vendorId,String oldPassword,String newPassword);
	
	public VendorBean getVendorDataById(String vendorId);
}
=======
package com.hit.dao;

import java.util.List;

import com.hit.beans.VendorBean;

public interface VendorDao {
	
	public String registerVendor(VendorBean vendor);
	
	public List<VendorBean> getAllVendors();
	
	public boolean validatePassword(String vendorId,String password);
	
	public String updateProfile(VendorBean vendor);
	
	public String changePassword(String vendorId,String oldPassword,String newPassword);
	
	public VendorBean getVendorDataById(String vendorId);
}
>>>>>>> 6261fa845ae58e03bfd663e1eb46fea81513eda0
