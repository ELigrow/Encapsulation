/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.eligrow.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jlombardo
 */
public class DateUtilities {
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
        return sdf.format(date);
    }
}
