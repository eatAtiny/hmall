package pay.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pay.service.domain.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 支付订单 Mapper 接口
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-16
 */
@Mapper
public interface PayOrderMapper extends BaseMapper<PayOrder> {

}
