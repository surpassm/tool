package com.github.surpassm.tool.core.convert.impl;

import com.github.surpassm.tool.core.convert.AbstractConverter;

/**
 * 泛型枚举转换器
 * 
 * @param <E> 枚举类类型
 * @author Looly
 * @since 4.0.2
 * @deprecated 请使用{@link EnumConverter}
 */
@Deprecated
public class GenericEnumConverter<E extends Enum<E>> extends AbstractConverter<E> {
	private static final long serialVersionUID = 1L;

	private Class<E> enumClass;
	
	/**
	 * 构造
	 * 
	 * @param enumClass 转换成的目标Enum类
	 */
	public GenericEnumConverter(Class<E> enumClass) {
		this.enumClass = enumClass;
	}

	@Override
	protected E convertInternal(Object value) {
		//noinspection unchecked
		E enumValue = (E) EnumConverter.tryConvertEnum(value, this.enumClass);
		if(null == enumValue && false == value instanceof String){
			// 最后尝试valueOf转换
			enumValue = Enum.valueOf(this.enumClass, convertToStr(value));
		}
		return enumValue;
	}

	@Override
	public Class<E> getTargetType() {
		return this.enumClass;
	}
}
