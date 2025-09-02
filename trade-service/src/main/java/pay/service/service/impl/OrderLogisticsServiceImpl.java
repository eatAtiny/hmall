package pay.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pay.service.domain.po.OrderLogistics;
import pay.service.mapper.OrderLogisticsMapper;
import pay.service.service.IOrderLogisticsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
@Service
public class OrderLogisticsServiceImpl extends ServiceImpl<OrderLogisticsMapper, OrderLogistics> implements IOrderLogisticsService {

}
