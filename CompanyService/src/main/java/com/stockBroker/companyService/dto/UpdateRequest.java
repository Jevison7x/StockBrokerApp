/*
 * Copyright (c) 2018, Xyneex Technologies. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * You are not meant to edit or modify this source code unless you are
 * authorized to do so.
 *
 * Please contact Xyneex Technologies, #1 Orok Orok Street, Calabar, Nigeria.
 * or visit www.xyneex.com if you need additional information or have any
 * questions.
 */
package com.stockBroker.companyService.dto;

/**
 *
 * @author BLAZE
 * @since Mar 11, 2023 9:19:42 PM
 */
public class UpdateRequest
{
    private String companySymbol;
    private double noOfShares;

    public UpdateRequest()
    {
    }

    public String getCompanySymbol()
    {
        return companySymbol;
    }

    public void setCompanySymbol(String companySymbol)
    {
        this.companySymbol = companySymbol;
    }

    public double getNoOfShares()
    {
        return noOfShares;
    }

    public void setNoOfShares(double noOfShares)
    {
        this.noOfShares = noOfShares;
    }
}
