/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.messaging.visualvm.ui;

import com.sun.messaging.jms.management.server.MQObjectName;
import com.sun.messaging.jms.management.server.ServiceAttributes;
import com.sun.messaging.jms.management.server.ServiceOperations;
import com.sun.tools.visualvm.core.ui.components.DataViewComponent;

@SuppressWarnings("serial")
public class ServiceMonitorServiceList extends MultipleMBeanResourceList {

    public ServiceMonitorServiceList(DataViewComponent dvc) {
		super(dvc);
	}

	private static String initialDisplayedAttrsList[] = {
    	ServiceAttributes.NAME, // Primary attribute
    	ServiceAttributes.PORT,
    	ServiceAttributes.STATE_LABEL
    };
    
    @Override
	public String[] getinitialDisplayedAttrsList() {
        return initialDisplayedAttrsList;  
    }
    
    // copied from com.sun.messaging.jmq.jmsserver.management.mbeans.ServiceMonitor
    private String completeAttrsList[] = {
    	    ServiceAttributes.MSG_BYTES_IN,
    	    ServiceAttributes.MSG_BYTES_OUT,
    	    ServiceAttributes.NAME,
    	    ServiceAttributes.NUM_ACTIVE_THREADS,
    	    ServiceAttributes.NUM_CONNECTIONS,
    	    ServiceAttributes.NUM_CONNECTIONS_OPENED,
    	    ServiceAttributes.NUM_CONNECTIONS_REJECTED,
    	    ServiceAttributes.NUM_CONSUMERS,
    	    ServiceAttributes.NUM_MSGS_IN,
    	    ServiceAttributes.NUM_MSGS_OUT,
    	    ServiceAttributes.NUM_PKTS_IN,
    	    ServiceAttributes.NUM_PKTS_OUT,
    	    ServiceAttributes.NUM_PRODUCERS,
    	    ServiceAttributes.PORT,
    	    ServiceAttributes.PKT_BYTES_IN,
    	    ServiceAttributes.PKT_BYTES_OUT,
    	    ServiceAttributes.STATE,
    	    ServiceAttributes.STATE_LABEL
   };        
    
    @Override
	public String[] getCompleteAttrsList() {
        return completeAttrsList;
    }      
    
	public String getPrimaryAttribute() {
		return ServiceAttributes.NAME;
	} 
   
	@Override
	protected String getManagerMBeanName() {
		return MQObjectName.SERVICE_MANAGER_MONITOR_MBEAN_NAME;
	}

	@Override
	protected String getGetSubMbeanOperationName(){
		return ServiceOperations.GET_SERVICES;
	}    

    @Override
    public void handleItemQuery(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public int getCorner() {
		return DataViewComponent.BOTTOM_LEFT;
	}
}
