package com.jiancode.tijian.po;

public class Orders {
	private Integer orderId;
	/**
     * 预约日期
     */
    private String orderDate;

    /**
     * 客户编号
     */
    private String userId;

    /**
     * 所属医院编号
     */
    private Integer hpId;

    /**
     * 所属套餐编号
     */
    private Integer smId;

    /**
     * 订单状态（1：未归档；2：已归档）
     */
    private Integer state;

    // 多对一
    private Setmeal setmeal;
    

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getHpId() {
		return hpId;
	}

	public void setHpId(Integer hpId) {
		this.hpId = hpId;
	}

	public Integer getSmId() {
		return smId;
	}

	public void setSmId(Integer smId) {
		this.smId = smId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Setmeal getSetmeal() {
		return setmeal;
	}

	public void setSetmeal(Setmeal setmeal) {
		this.setmeal = setmeal;
	}
    
    
	
}
