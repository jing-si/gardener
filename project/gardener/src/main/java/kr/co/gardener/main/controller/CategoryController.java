package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	final String path = "main/category/";
	
	//ī�װ�
	@RequestMapping({"/",""})
	public String category() {
		return path + "category-list";
	}
	
	//ǰ�� ī�װ�
	@RequestMapping("/product")
	public String productlist() {
		return path + "product-list";
	}
	
	//�ش� ��ǰ�� ��������
	@RequestMapping("/product/{productId}")
	public String productdetail(@PathVariable int productId) {
		return path + "product-detail";
	}
	
	//�귣�庰 ī�װ�
	@RequestMapping("/brand")
	public String brandList(Model model) {
		model.addAttribute("brandName","brandName");
		//�ؿ� �ΰ� ����Ʈ ������ּ���
		//�ش� �귣�� ��ǰ�� �̸� ����Ʈ
		model.addAttribute("productNameList","productNameList");
		//�ش� �귣���� ��ǰ�� �̹��� ����Ʈ
		model.addAttribute("productImgList","productImgList");
		return path + "brand-list";
	}
}
