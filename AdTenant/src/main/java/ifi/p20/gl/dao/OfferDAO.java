package ifi.p20.gl.dao;

import java.util.ArrayList;

import ifi.p20.gl.entity.Country;
import ifi.p20.gl.entity.Offer;
import ifi.p20.gl.model.OfferInfo;
import ifi.p20.gl.utils.PaginationResult;

public interface OfferDAO {
	public Offer findOfferByLocation(String location);

	public OfferInfo findOfferInfoByLocation(String location);

	public Offer findOfferById(int id);

	public OfferInfo findOfferInfoById(int id);

	public PaginationResult<OfferInfo> queryProducts(int page, int maxResult, int maxNavigationPage);

	public PaginationResult<OfferInfo> queryProducts(int page, int maxResult, int maxNavigationPage, String likeName);

	public void save(OfferInfo offerInfo);
}
