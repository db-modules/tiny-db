package edu.utdallas.davisbase.server.a_frontend.domain.commands;

import edu.utdallas.davisbase.server.a_frontend.domain.clause.A_Predicate;

/**
 * Data for the SQL <i>delete</i> statement.
 *
 * @author Edward Sciore
 */
public class DeleteData {
    private String tblname;
    private A_Predicate pred;

    /**
     * Saves the table name and predicate.
     */
    public DeleteData(String tblname, A_Predicate pred) {
        this.tblname = tblname;
        this.pred = pred;
    }

    /**
     * Returns the name of the affected table.
     *
     * @return the name of the affected table
     */
    public String tableName() {
        return tblname;
    }

    /**
     * Returns the predicate that describes which
     * records should be deleted.
     *
     * @return the deletion predicate
     */
    public A_Predicate pred() {
        return pred;
    }
}

