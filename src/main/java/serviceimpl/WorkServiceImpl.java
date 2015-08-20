package serviceimpl;

import org.apache.log4j.Logger;
import service.WorkService;

/**
 * Created by ZHANGJA4 on 8/20/2015.
 */
public class WorkServiceImpl implements WorkService {

    public WorkServiceImpl() {
        System.out.println("WorkServiceImpl...");
    }

    @Override
    public void work(String a) {
        Logger logger = Logger.getLogger(WorkServiceImpl.class);
        System.out.println(a);
        System.out.println("work()...");
    }
}
