public class ToolDaoFactory {
    // DAO_FACTORY
    private static Tools toolsDao;

    public static Tools getToolsDao() {
        if(toolsDao == null) {
            toolsDao = new ListTools();
        }
        return toolsDao;
    }
}


