/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;

/**
 *
 * @author yusuf
 */
public class indexComposer extends GenericForwardComposer {

    @Wire
    private Listbox Listboxs;

    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
     
    }

    public void onClick$btnModal(Event e) throws InterruptedException {
        Window window = (Window) Executions.createComponents(
                "index2.zul", null, null);
        window.doModal();

    }

   

}
