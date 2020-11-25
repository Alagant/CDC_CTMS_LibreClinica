/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.dao.extract;

import org.akaza.openclinica.bean.core.EntityBean;
import org.akaza.openclinica.bean.extract.QueryBean;
import org.akaza.openclinica.dao.core.AuditableEntityDAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.sql.DataSource;

/**
 * @author thickerson
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class QueryDAO extends AuditableEntityDAO<QueryBean> {
    // private DataSource ds;

    public QueryDAO(DataSource ds) {
        super(ds);
    }

    @Override
    protected void setDigesterName() {
        // digesterName = SQLFactory.getInstance().DAO_QUERY;
    }

    @Override
    public void setTypesExpected() {

    }

    public QueryBean update(QueryBean eb) {
        return eb;
    }

    public QueryBean create(QueryBean eb) {
        return eb;
    }

    public QueryBean getEntityFromHashMap(HashMap hm) {
        QueryBean eb = new QueryBean();

        return eb;
    }

    public Collection findAll() {
        ArrayList al = new ArrayList();

        return al;
    }

    public Collection findAll(String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
        ArrayList al = new ArrayList();

        return al;
    }

    public EntityBean findByPK(int ID) {
        QueryBean eb = new QueryBean();

        return eb;
    }

    public Collection findAllByPermission(Object objCurrentUser, int intActionType, String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
        ArrayList al = new ArrayList();

        return al;
    }

    public Collection findAllByPermission(Object objCurrentUser, int intActionType) {
        ArrayList al = new ArrayList();

        return al;
    }

	@Override
	public QueryBean emptyBean() {
		return new QueryBean();
	}

}
