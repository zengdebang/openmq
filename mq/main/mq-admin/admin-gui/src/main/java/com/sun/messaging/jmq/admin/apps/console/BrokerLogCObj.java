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

/*
 * @(#)BrokerLogCObj.java	1.6 06/27/07
 */ 

package com.sun.messaging.jmq.admin.apps.console;

import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;

import com.sun.messaging.jmq.admin.util.Globals;
import com.sun.messaging.jmq.admin.resources.AdminConsoleResources;

/** 
 * This class is used in the JMQ Administration console
 * to store information related to a particular broker
 * log.
 *
 * @see ConsoleObj
 * @see BrokerAdminCObj
 *
 */
public class BrokerLogCObj extends BrokerAdminCObj  {
    private static AdminConsoleResources acr = Globals.getAdminConsoleResources();

    public String getExplorerLabel()  {
	return (acr.getString(acr.I_BROKER_LOG));
    }

    public String getExplorerToolTip()  {
	return (null);
    }

    public ImageIcon getExplorerIcon()  {
	return (null);
    }

    public int getExplorerPopupMenuItemMask()  {
	return (getActiveActions());
    }


    public int getActiveActions()  {
	return (0);
    }



    public String getInspectorPanelClassName()  {
	return (null);
    }

    public String getInspectorPanelId()  {
	return (null);
    }

    public String getInspectorPanelHeader()  {
	return (null);
    }
}
