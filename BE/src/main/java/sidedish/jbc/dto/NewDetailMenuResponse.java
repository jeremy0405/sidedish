package sidedish.jbc.dto;

import java.util.List;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;
import sidedish.jbc.domain.Image;
import sidedish.jbc.domain.SaleType;

public class NewDetailMenuResponse {

	private String name;
	private String description;
	private int price;
	private SaleType saleType;
	private String deliveryInfo;
	private int fee;
	private int freeShippingStartingPrice;
//	@MappedCollection(idColumn = "menu_id", keyColumn = "ID")
	private final List<Image> images;

	@PersistenceConstructor
	public NewDetailMenuResponse(String name, String description, int price,
		SaleType saleType, String deliveryInfo, int fee, int freeShippingStartingPrice,
		List<Image> images) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.saleType = saleType;
		this.deliveryInfo = deliveryInfo;
		this.fee = fee;
		this.freeShippingStartingPrice = freeShippingStartingPrice;
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public SaleType getSaleType() {
		return saleType;
	}

	public String getDeliveryInfo() {
		return deliveryInfo;
	}

	public int getFee() {
		return fee;
	}

	public int getFreeShippingStartingPrice() {
		return freeShippingStartingPrice;
	}

	public List<Image> getImages() {
		return images;
	}

	@Override
	public String toString() {
		return "NewDetailMenuResponse{" +
			"name='" + name + '\'' +
			", description='" + description + '\'' +
			", price=" + price +
			", saleType=" + saleType +
			", deliveryInfo='" + deliveryInfo + '\'' +
			", fee=" + fee +
			", freeShippingStartingPrice=" + freeShippingStartingPrice +
			", images=" + images +
			'}';
	}
}
