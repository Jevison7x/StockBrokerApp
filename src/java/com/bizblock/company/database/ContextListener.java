package com.bizblock.company.database;

import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Praise
 */
public class ContextListener implements ServletContextListener
{
    public static String baseURL;

    public static String uploadsBaseURL;

    public static String tempImagesURL;

    public static String moveImageServletURL;

    public static String images;

    public ContextListener()
    {

    }

    public String getUploadsBaseURL()
    {
        return ContextListener.uploadsBaseURL;
    }

    public String getTempImagesURL()
    {
        return ContextListener.tempImagesURL;
    }

    public String getBaseURL()
    {
        return ContextListener.baseURL;
    }

    public String getImages()
    {
        return ContextListener.images;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        ServletContext context = sce.getServletContext();
        ContextListener.uploadsBaseURL = context.getInitParameter("FitWage Uploads Base URL");
        ContextListener.tempImagesURL = context.getInitParameter("FitWage Temp Images URL");
        ContextListener.baseURL = context.getInitParameter("FitWage Web URL");
        ContextListener.images = context.getInitParameter("FitWage Permanent Images");
        ContextListener.moveImageServletURL = context.getInitParameter("Move Image Servlet");
        context.setAttribute("con", new ContextListener());
        this.loadEntityManagerFactory();
    }

    private void loadEntityManagerFactory()
    {
        DBConfiguration.remoteEntityManagerFactory = Persistence.createEntityManagerFactory("FitWagePU");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
    }
}
