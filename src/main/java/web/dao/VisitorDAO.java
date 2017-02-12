package web.dao;

import web.models.Visitor;

import java.util.List;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public interface VisitorDAO {
    Visitor getVisitorById(Long visitor_id);
    List<Visitor> getAllVisitor() throws Exception;
}
