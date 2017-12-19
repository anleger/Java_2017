package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����.
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//Method��ü�� �ϳ��� ó��
		for(Method method: declaredMethods){
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				PrintAnnotation printAnnotation =
						method.getAnnotation(PrintAnnotation.class);
				/*System.out.println(method.getName() + ": ");
				System.out.println("value=" + printAnnotation.value());
				System.out.println("number=" + printAnnotation.number());
				System.out.println();*/
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				//���м� ���
				for(int i=0; i<printAnnotation.number(); i++){
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//�޼ҵ�ȣ��
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					
				}
				System.out.println();
				
			}
			
		}

	}

}